package Homework06.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws ParseException {
        List<String> commands = new ArrayList<>();
        commands.add("MOVE VIEW view1 view2 FROM srcDB TO dstDB");
        commands.add("copy table from src to dst");
        commands.add("copy function from src to dst");
        Node node = new ProgramNode();
        for (String cmd : commands) {
            node.interpret(new Context(cmd));
            node.execute();
        }
    }
}
