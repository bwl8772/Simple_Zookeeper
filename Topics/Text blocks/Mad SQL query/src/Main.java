public class Main {
    public static void main(String[] args) {
            //fix the code below
             String querySQL = "SELECT u.username, COUNT(*) as num_posts\n" +
                  "FROM users u\n" +
                  "JOIN posts p ON u.id = p.user_id\n" +
                  "WHERE p.published_at >= '2022-01-01'\n" +
                  "GROUP BY u.username\n" +
                  "HAVING COUNT(*) > 10\n" +
                  "ORDER BY num_posts DESC\n" +
                  "LIMIT 10;\n";

        System.out.println(querySQL);
    }
}
