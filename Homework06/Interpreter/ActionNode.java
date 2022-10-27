package Homework06.Interpreter;

public class ActionNode extends Node{
    private String operate;
    private String opName;
    @Override
    public void interpret(Context context) throws ParseException {
        operate = context.currentToken();
        context.skipToken(operate);
        if (operate.equalsIgnoreCase("COPY")) {
            this.opName = "复制";
        } else if (operate.equalsIgnoreCase("MOVE")) {
            this.opName = "移动";
        } else {
            throw new ParseException(operate + " is undefined! Please input COPY or MOVE!");
        }
    }

    @Override
    public String execute() {
        return this.opName;
    }
}
