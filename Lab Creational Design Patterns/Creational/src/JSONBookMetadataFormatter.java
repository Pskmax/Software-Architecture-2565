import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonArray;
    private JSONObject jsonObject;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject bookObj = new JSONObject();

        bookObj.put(Book.Metadata.ISBN.value, b.getISBN());
        bookObj.put(Book.Metadata.TITLE.value, b.getTitle());
        bookObj.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

        JSONArray authors = new JSONArray();
        for (String author : b.getAuthors()){
            authors.add(author);
        }
        bookObj.put(Book.Metadata.AUTHORS.value, authors);
        jsonArray.add(bookObj);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return jsonArray.toJSONString();
    }
}
