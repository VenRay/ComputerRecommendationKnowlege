import java.lang.reflect.Method;

public class Reflect
{
    public static void main(String[] args) throws Exception //在方法后加上这句，异常就消失了
    {
        //获得字符串所标识的类的class对象
        Class<?> classType = Class.forName("java.lang.String");//在此处传入字符串指定类名，所以参数获取可以是一个运行期的行为，可以用args[0]
        
        //返回class对象所对应的类或接口中，所声明的所有方法的数组（包括私有方法）
        Method[] methods = classType.getDeclaredMethods();
        
        //遍历输出所有方法声明
        for(Method method : methods)
        {
            System.out.println(method);
        }
    }

}