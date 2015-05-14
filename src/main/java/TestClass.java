import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
error
public class TestClass {
    String version = String.valueOf("One more changes...");

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        List<Object> tickets = new ArrayList<>();
        List<Entry> commits = new ArrayList<Entry>();
        Entry entry = new Entry();
        tickets.add("Ticket");
        commits.add(entry);
        try {
            CommitTicketData metadata = new CommitTicketData();
            metadata.setCommits(commits);
            metadata.setTickets(tickets);
            String result = mapper.writeValueAsString(metadata);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
