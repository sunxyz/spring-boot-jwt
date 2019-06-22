# spring-boot-jwt

> spring-boot-jwt = spring-security+jwt; 配合　iview-admin 更好用　,挖个坑以后填,>_<哈哈

## 如何使用

### step 1

下载之后打包安装到本地

```
mvn install -Dmaven.test.skip=true
```
有私服的可以推送到私服
```
mvn deploy -Dmaven.test.skip=true
```

### step 2

需要jwt的项目进行引入

如　sample-project

pom 引入

```
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.sj</groupId>
            <artifactId>commons</artifactId>
            <version>1.0-SNAPSHOT</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

```
<dependencies>
    <dependency>
        <groupId>com.sj</groupId>
        <artifactId>commons-web</artifactId>
    </dependency>
</dependencies>
```
如果运行提示版本过低，可以增加下面两行即可．
```
<properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>
```

### step 3
```
@SpringBootApplication(scanBasePackages={"com.sj","com.youselfpackage"})
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}
```
## 注意事项

* spring-boot 已引用不需重复引用
* spring-boot 版本为2.1.5.RELEASE
