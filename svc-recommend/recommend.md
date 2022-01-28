### 接口：推荐相关审稿人
* 地址：http://47.106.211.96:8885/reviewer/recommend
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=421489&itf=1782551](http://rap2.taobao.org/repository/editor?id=267630&mod=421489&itf=1782551)
* 请求接口格式：

```
├─ title: String (文章标题)
├─ authors: String (作者列表，用英文分号;隔开)
├─ keywords: String (关键词列表，用英文分号;隔开)
└─ publication: String (投稿的期刊/会议名)

```

* 返回接口格式：

```
├─ success: Boolean 
├─ message: String 
└─ content: Array 
   ├─ name: String (作者姓名)
   ├─ id: Number (作者id)
   ├─ db: String 
   ├─ institutions: Array (作者所属机构列表): Array (作者所属机构列表)
   └─ keywords: Array (作者的研究关键词列表): Array (作者的研究关键词列表)

```


### 接口：屏蔽相关审稿人
* 地址：http://47.106.211.96:8885/reviewer/shield
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=421489&itf=1782554](http://rap2.taobao.org/repository/editor?id=267630&mod=421489&itf=1782554)
* 请求接口格式：

```
├─ title: String (文章标题)
├─ authors: String (作者列表，用英文分号;隔开)
├─ keywords: String (关键词列表，用英文分号;隔开)
└─ publication: String (投稿的期刊/会议名)

```

* 返回接口格式：

```
├─ success: Boolean 
├─ message: String 
└─ content: Array 
   ├─ name: String (作者姓名)
   ├─ id: Number (作者id)
   ├─ db: String 
   ├─ institutions: Array (作者所属机构列表): Array (作者所属机构列表)
   └─ keywords: Array (作者的研究关键词列表): Array (作者的研究关键词列表)

```