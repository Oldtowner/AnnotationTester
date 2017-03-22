package ie.oldtowner;

import java.lang.reflect.Method;

public class TestAnalyzer {
    /**
     *  Counts the number of methods in the class given by `clazz` that have been annotated
     *  with the @Test annotation.
     */
    public static int getNumAnnotatedMethods(Class<?> clazz) {
        if( clazz!=null){
            Method[] methods = clazz.getMethods();
            int methodCount = 0;
            for(Method m:methods){
                if(m.getAnnotation(Test.class)!=null)
                    methodCount++;
            }
            Test[] test = clazz.getAnnotationsByType(Test.class);
            return test.length;
        }
        return 0;
    }
}
