package decorator;

public class CompressedCloudStream implements Stream{
	private Stream stream;
	
	public CompressedCloudStream(Stream stream) {
		super();
		this.stream = stream;
	}

	@Override
	public void write(String data) {
		String compressData = compress(data);
		stream.write(compressData);
	}

	private String compress(String data) {
		return data.substring(0,5);
	}
}
