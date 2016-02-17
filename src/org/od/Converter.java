package org.od;

import org.od.model.Simply;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sch062
 * @since 2/17/16.
 */
public class Converter {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {


        Simply s = new Simply();
        s.setNum(2);
        s.setNum2(34);
        s.setText("textik");


        System.out.println(s);

        Simply a = new Simply();
        a.setText("textik");
        a.setNum(2);
        a.setNum2(34);
        System.out.println(a);

        generateDeclaration(s);


    }

    private static String[] names = new String[] {"a", "b"};

    public static void generateDeclaration(Object o) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int pointer = 0;
        System.out.println(o.getClass().getSimpleName() + " " + names[pointer] + " = new " + o.getClass().getSimpleName() + "();");
        for (Method m : o.getClass().getMethods()) {
            if (m.getName().startsWith("set")) {
                System.out.print(names[pointer] + "." + m.getName() + "(");
                String returnType = o.getClass().getMethod(getMethod(m.getName())).getReturnType().getSimpleName();
                if (returnType.equals("String")) {
                    System.out.print("\"");
                }
                System.out.print(o.getClass().getMethod("g" + m.getName().substring(1)).invoke(o));
                switch (returnType) {
                    case "String":
                        System.out.print("\"");
                        break;
                    case "Long":
                        System.out.print("L");
                        break;
                }
                System.out.println(");");
            }
        }
    }

    private static String getMethod(String setNameMethod) {
        return "g" + setNameMethod.substring(1);
    }


}
