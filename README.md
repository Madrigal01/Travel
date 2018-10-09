# Travel# 摄影作品上传平台 
## 核心框架基于SSM


### 学习心得：
>* 要导入mybatis-generator：   
   在pom.xml - build - plugins - plugin中导入**mybatis-generator-maven-plugin**即可
   
>* mybatis-generator的配置文件是generatorConfig.xml，里面有完整的注释，这里就不多讲了

>* datasource.properties 中配置mysql.jar包时需要用绝对路径，如果有人要直接copy我的代码的话请修改路径

>* 在mapper文件中 对createTime 和  updateTime 时间戳进行更新 用db的语法来控制，不用Java的语法



## 接口设计
### 首页-用户接口
>* 登录
>* 注册
>* 检查用户是否有效
>* 获取登录状态信息
>* 忘记密码
>* 提交问题答案
>* 忘记密码的重设密码
>* 登录状态 重置密码
>* 登录状态更新个人信息
>* 获取当前登录用户的详细信息，并强制登录
>* 退出登录

### 后台用户接口
>* 后台管理员登录

### 后台-产品接口
>* 作品列表
>* 作品搜索
>* 图片上传
>* 产品详情
>* 产品上下架
>* 新增OR更新作品



