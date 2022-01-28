### 接口：同一研究者在不同时间的单位情况
* 地址：http://47.106.211.96:8883/author/institution
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1832877](http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1832877)
* 请求接口格式：

```
├─ id: Number (作者id)
└─ db: String (ACM|IEEE)

```

* 返回接口格式：

```
├─ success: Boolean 
├─ message: String 
└─ content: Array 
   ├─ time: Number 
   ├─ institution: String 
   ├─ id: Number (机构id)
   └─ db: String 

```

### 接口：同一单位的同名作者
* 地址：http://47.106.211.96:8883/institution/sameAuthor
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1832885](http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1832885)
* 请求接口格式：

```
├─ id: Number (机构id)
└─ db: String (ACM|IEEE)

```

* 返回接口格式：

```
├─ success: Boolean 
├─ message: String 
└─ content: Array 
   └─ sameAuthors: Array 
      ├─ id: Number 
      ├─ name: String 
      └─ db: String 

```