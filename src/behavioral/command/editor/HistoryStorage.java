package behavioral.command.editor;

import java.io.*;

public class HistoryStorage {
  public void save(History history) {
    try {
      FileOutputStream fileStream = new FileOutputStream("history.txt");
      ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
      objectStream.writeObject(history);
      objectStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public History restore() {
    try {
      FileInputStream fileStream = new FileInputStream("history.txt");
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);
      History history = (History) objectStream.readObject();
      return history;
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      return null;
    }
  }
}
