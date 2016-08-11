package info.liangsheng.annotation;


import java.lang.reflect.Method;

public class AnalysisAnnotation {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("info.liangsheng.annotation.Utility");
        boolean isAnnotationPresent = clazz.isAnnotationPresent(Description.class);
        if(isAnnotationPresent){
            Description description = (Description)clazz.getAnnotation(Description.class);
            System.out.println(description.value());

            for(Method method: clazz.getMethods()){
                if(method.isAnnotationPresent(Author.class)){
                    Author author = (Author)method.getAnnotation(Author.class);
                    System.out.println(author.name());
                    System.out.println(author.group());
                }
            }
        }
    }
}
