package main;

import behavioral.chainOfResponsibility.Authenticator;
import behavioral.chainOfResponsibility.Compressor;
import behavioral.chainOfResponsibility.Handler;
import behavioral.chainOfResponsibility.HttpRequest;
import behavioral.chainOfResponsibility.Logger;
import behavioral.chainOfResponsibility.WebServer;
import behavioral.iterator.BrowseHistory;
import behavioral.iterator.Iterator;
import behavioral.observer.Chart;
import behavioral.observer.DataSource;
import behavioral.observer.SpreadSheet;
import behavioral.state.Canvas;
import behavioral.state.EraserTool;
import behavioral.state.SelectionTool;
import behavioral.strategy.BlackAndWhiteFilter;
import behavioral.strategy.ImageStorage;
import behavioral.strategy.JpegCompressor;
import behavioral.strategy.PngCompressor;
import behavioral.template.Task;
import behavioral.template.TransferMoneyTask;

public class Main {
	
	public static void main(String[] args) {
		Handler auth = new Authenticator(new Logger(new Compressor(null)));
		WebServer ws = new WebServer(auth);
		ws.handle(new HttpRequest("admin", "124"));
	}

}
