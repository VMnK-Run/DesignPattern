package Homework06.Interpreter;

public class ProgramNode extends Node{
    private Node actionNode;
    private Node typeNode;
    private TargetNode targetNode;
    private Node srcDBNode;
    private Node dstDBNode;

    @Override
    public void interpret(Context context) throws ParseException {
        if (context.currentToken() == null) {
            System.out.println("请输入指令！");
        } else {
            actionNode = new ActionNode();
            actionNode.interpret(context);
            typeNode = new TypeNode();
            typeNode.interpret(context);
            targetNode = new TargetNode();
            targetNode.interpret(context);
            if (context.currentToken() == null || !context.currentToken().equalsIgnoreCase("FROM")) {
                throw new ParseException("Missing token FROM!");
            } else {
                context.nextToken();
                srcDBNode = new DBNode();
                srcDBNode.interpret(context);
            }

            if (context.currentToken() == null || !context.currentToken().equalsIgnoreCase("TO")) {
                throw new ParseException("Missing token TO!");
            } else {
                context.nextToken();
                dstDBNode = new DBNode();
                dstDBNode.interpret(context);
            }

        }
    }

    @Override
    public String execute() {
        if (targetNode.getNames().isEmpty()) {
            System.out.println("将数据库" + srcDBNode.execute() + "的所有" + typeNode.execute()
                    + actionNode.execute() + "到数据库" + dstDBNode.execute());
        } else {
            System.out.println("将数据库" + srcDBNode.execute() + "中的" + typeNode.execute()
                    + targetNode.getNames() + actionNode.execute() + "到数据库" + dstDBNode.execute());
        }
        return null;
    }
}
