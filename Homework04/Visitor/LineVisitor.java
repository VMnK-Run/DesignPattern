package Homework04.Visitor;

public class LineVisitor extends Visitor{
    @Override
    public void visit(Codes codes) {
        System.out.print("源代码总行数为:");
        int lines = 0;
        for(Clazz clazz : codes.getClasses()) {
            lines += clazz.getAttributes().size();
            for(Method method : clazz.getMethods()) {
                lines += method.getLine();
            }
        }
        System.out.println(lines);
    }

    @Override
    public void visit(Clazz clazz) {
        System.out.print("类" + clazz.getName() + "的行数为:");
        int lines = 0;
        for(Method method : clazz.getMethods()) {
            lines += method.getLine();
        }
        lines += clazz.getAttributes().size();
        System.out.println(lines);
    }

    @Override
    public void visit(Method method) {
        System.out.println("方法" + method.getName() + "的行数为" + method.getLine());
    }

    @Override
    public void visit(Attribute attribute) {
    }
}
