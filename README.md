# Spring_learning
Spring从入门到进阶

1. Spring入门: Spring IOC的快速入门

2. Spring Bean管理: 
   1. spring方式及工厂类实现   ——— 对应demo1  
   
   2. 三种实例化Bean的方式：  ———对应demo2  
      使用类构造器实例化（默认无参数）  
      使用静态工厂方法实例化（简单工厂模式）  
      使用实例工厂方法实例化（工厂方法模式）
   
   3. bean的作用范围及生命周期   ———对应demo3
   
   4. Bean 的构造方法的属性注入  ———对应demo4  
      set 方法和 p 命名空间的属性注入  
      Bean 的 SpEL 的属性注入
   
   5. 集合类型的属性注入:  ———对应demo5  
      复杂类型的属性注入  
      数组类型的属性注入 List  
      集合类型的属性注入 Set  
      集合类型的属性注入 Map  
      类型的属性注入  Properties

3. Spring Bean管理（注解方式)  
   1. 使用注解定义Bean:  
   @Component  描述Spring框架中Bean (下面👇三个功能和@Component等效)  
   @Repository 用于对DAO实现类进行标注  
   @Service 用于对Service实现类进行标注  
   @Controller 用于对Controller实现类进行标注  
   
   2. Spring的属性注入-注解方式
   
   3. Spring的其他注解

4. Spring的AOP
   1. 使用代理，横向抽取，代码增强
   2. 使用CGLIB生成代理
   3. 前置通知 MethodBeforeAdvice,Spring 的 AOP 产生代理对象
   4. 环绕通知 MethodInterceptor,一般的切面是使用通知作为切面,因为要对目标类的某个方法进行增强就需要配置一个带有切入点的切面
   5. 自动创建代理
   6. 自动创建代理并配置切面
   
5. 基于AspectJ的AOP开发
   1. 注解开发，自动代理  
   @Before 前置通知，相当于BeforeAdvice  
   @AfterReturning 后置通知，相当于AfterReturningAdvice
   @Around 环绕通知，相当于MethodInterceptor 
   @AfterThrowing异常抛出通知，相当于ThrowAdvice  
   @After 最终final通知，不管是否异常，该通知都会执行
   2. xml方式编写切面，完成切面类的配置及配置AOP完成增强
 
 6. JDBC Template  
    1. execute方法：update与batchUpdate，query与queryXXX
    2. call方法：
    3. update方法：对数据进行增删改操作
    4. batchUpdate方法：批量增删改操作
    5. 查询简单数据项：T queryForObject(获取一个)，List<T> queryForList（获取多个）
    6. 查询复杂对象（封装为map）：Map queryForMap(获取一个)，List<Map<String,Object>> queryForLi（获取多个）
    7. 查询复杂对象（封装为实体对象）：T queryForObject（RowMapper<T>）(获取一个)  
                                   List<T> query（RowMapper<T>）(获取多个) 