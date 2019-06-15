# commons-web-core

> 认证登录及安全相关功能

## 获取token
    
**简要描述：** 

- 登录-获取token

**请求URL：** 
- ` http://xx.com/token/signin`
  
**请求方式：**
- POST 

**参数：** 

|参数名|必选|类型|说明|
|:----    |:---|:----- |-----   |
|username |是  |String | 用户名   |
|password |是  |String | 密码    |

 **返回示例**

``` 
xxx-token
```

 **返回参数说明** 
```
返回token 字符串
```

## token使用

请求时在header 头携带 可以参考下面　获取当前token 用户

Authorization: Bearer　xxx-token


## 获取当前token 用户

请求报文
```
GET /token/me
Host: xxx.com
Authorization: Bearer　xxx-token

```