package DijkstrasInterpreter;

public class App {
    public static void main(String[] args) {
        Algorithm a = new Algorithm();

        //a.interpretExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
        a.interpretExpression("( ( 1 + 2 ) * ( 2 + 1 ) / ( 3 ) )");
        a.result();
    }
}
