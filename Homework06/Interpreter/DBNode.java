package Homework06.Interpreter;

public class DBNode extends Node{
    private String dbName;
    @Override
    public void interpret(Context context) throws ParseException {
        if(context.currentToken() == null) {
            throw new ParseException("Missing DataBase's name!");
        }
        this.dbName = context.currentToken();
        context.skipToken(dbName);
    }

    @Override
    public String execute() {
        return this.dbName;
    }
}
