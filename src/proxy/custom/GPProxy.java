package proxy.custom;

public class GPProxy {

    public static final String rn ="\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader,Class<?> interfaces,GPInvocationHandler handler){
        // 1.动态生成源代码 .java文件
       // generateSrc(interfaces);

        // 2. 将java文件输出到磁盘

        // 3. 把生成的.java文件编译成.class文件

        // 4. 编译生成的.class文件加载到JVM中来

        // 5. 返回字节码重组以后的新的代理对象

        return null;
    }

    private static void generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package proxy.custom"+ rn);
        sb.append("public class $Proxy0 implements"+interfaces[0].getName()+"{"+rn);
        sb.append("}"+rn);

    }
}
