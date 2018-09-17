**备注**
本版本的Spring boot 为 1.5.8.RELEASE
Druid版本为 1.1.5

如果 Spring Boot版本为 2.0.5.RELEASE
则Druid 版本要为 1.1.10
否则会报错
https://github.com/alibaba/druid/issues/2133
配置完成后，直接启动项目访问地址：
http://localhost:8087/druid，就会出现 druid 监控后台的登陆页面，输入账户和密码后，就会进入首页。