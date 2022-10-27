package Homework06.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class TargetNode extends Node{
    private List<String> names = new ArrayList<>();
    @Override
    public void interpret(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing token!");
            } else if (context.currentToken().equalsIgnoreCase("FROM")) {
                break;
            } else {
                String currentName = context.currentToken();
                context.skipToken(currentName);
                names.add(currentName);
            }
        }
    }

    @Override
    public String execute() {
        return null;
    }

    public List<String> getNames() {
        return names;
    }
}
