package Homework06.Interpreter;

public class TypeNode extends Node{
    private String type;
    private String typeName;
    @Override
    public void interpret(Context context) throws ParseException {
        type = context.currentToken();
        context.skipToken(type);
        if (type.equalsIgnoreCase("VIEW")) {
            this.typeName = "视图";
        } else if (type.equalsIgnoreCase("FUNCTION")) {
            this.typeName = "函数";
        } else if (type.equalsIgnoreCase("TABLE")) {
            this.typeName = "表";
        } else {
            throw new ParseException(type + " is undefined!");
        }
    }

    @Override
    public String execute() {
        return this.typeName;
    }
}
