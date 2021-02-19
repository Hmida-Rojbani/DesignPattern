package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
  private List<String> urls = new ArrayList<>();
  private int count;

  public void push(String url) {
    urls.add(url);
    count++;
  }

  public String pop() {
    return urls.remove(--count);
  }

  public Iterator createIterator() {
    return new ListIterator(this);
  }

  public class ListIterator implements Iterator {
    private BrowseHistory history;
    private int index;

    public ListIterator(BrowseHistory history) {
      this.history = history;
    }

    @Override
    public boolean hasNext() {
      return (index < history.count);
    }

    @Override
    public String current() {
      return history.urls.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }

}
