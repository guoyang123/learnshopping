
## 电商项目-需求分析
### 核心-购买

 #### 一、用户模块
 ###### 登录
 ###### 注册
 ###### 忘记密码
 ###### 获取用户信息
 ###### 修改密码
 ###### 登出
 #### 二、商品模块
 ##### 后台
 ###### 添加商品
 ###### 修改商品
 ###### 删除商品
 ###### 商品上下架
 ###### 查看商品
 ##### 前台（门户）
 ###### 搜索商品 
 ###### 查看商品详情
 #### 三、类别模块
 ###### 添加类别
 ###### 修改类别
 ###### 删除类别
 #####  查看类别
 ###### 查看子类
 ###### 查看后代类别  
 #### 四、购物车模块
 ###### 添加到购物车
 ###### 修改购物车中某个商品的数量
 ###### 删除购物车商品
 ###### 全选/取消全选
 ###### 单选/取消单选
 ###### 查看购物车中商品数量
 #### 五、地址模块
 ###### 添加地址
 ###### 修改地址
 ###### 删除地址
 ###### 查看地址 
 #### 六、订单模块
 ##### 前台
  ###### 下订单
  ###### 订单列表
  ###### 取消订单
  ###### 订单详情
 ##### 后台 
  ###### 订单列表
  ###### 订单详情
  ###### 发货
 #### 七、支付模块
  ##### 支付宝支付
  ###### 支付
  ###### 支付回调
  ###### 查看支付状态
 #### 八、线上部署
  ##### 阿里云部署
 # --------20181204------------ 
## 远程分支合并dev分支
 ```
 git checkout dev
 git pull origin dev
 git checkout master
 git merge dev
 git push origin master
 ```   
 ## 数据库设计
 ### 创建数据库
 ```
  create database ilearnshopping;
  use ilearnshopping;
 ```
 ### 用户表
 ```
 create table neuedu_user(
 `id`         int(11)     not null   auto_increment  comment '用户id',
 `username`   varchar(50) not null   comment '用户名',
 `password`   varchar(50) not null   comment '密码',
 `email`      varchar(50) not null   comment '邮箱',
 `phone`      varchar(11) not null   comment '联系方式', 
 `question`   varchar(100) not null  comment '密保问题',
 `answer`     varchar(100) not null  comment '答案',
 `role`       int(4)       not null  default 0  comment '用户角色',
 `create_time`   datetime    comment '创建时间',
 `update_time`  datetime   comment '修改时间',
  PRIMARY KEY(`id`),
  UNIQUE KEY `user_name_index`(`username`) USING BTREE
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8
 ```
 ### 类别表
 ### 商品表
 ### 购物车表
 ### 订单表
 ### 订单明细表
 ### 支付表
 ### 地址表
 
 
 
 
 
 
   
    
 
 






