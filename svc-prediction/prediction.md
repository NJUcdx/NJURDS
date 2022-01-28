### 接口：作者兴趣预测API
* 地址：http://47.106.211.96:8884/author/predict
* 类型：POST
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1779502](http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1779502)
* 请求接口格式：

```
└─ documents: Array (文献)
   ├─ title: String (标题)
   ├─ publication: String (会议/期刊)
   ├─ year: Number (发表年份)
   ├─ authors: Array (作者列表)
   │  ├─ id: Number (作者id)
   │  ├─ name: String (作者名字)
   │  └─ ins: String (作者所属机构)
   └─ keywords: Array (关键词列表): Array (关键词列表)

```
* 请求接口格式示例：
```
[
    {
        "title":"title",
        "publication":"2020 ICSE",
        "year":2020,
        "authors":[
            {"id":1, "name":"Zhang San", "ins":"NJU"},
            {"id":2, "name":"Li Si", "ins":"PKU"}
        ],
        "keywords":["k1", "k2", "k3"]
    },
        {
        "title":"title2",
        "publication":"2020 ICSE",
        "year":2020,
        "authors":[
            {"id":1, "name":"Zhang San", "ins":"NJU"},
            {"id":2, "name":"Li Si", "ins":"PKU"}
        ],
        "keywords":["k1", "k2", "k3"]
    }
]

```

* 返回接口格式：

```
├─ year: Number (预测年份)
└─ word: String (预测兴趣)

```


### 接口：合作关系预测API
* 地址：http://47.106.211.96:8884/author/coworkers/predict
* 类型：POST
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1779504](http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1779504)
* 请求接口格式：

```
└─ documents: Array (文献)
   ├─ title: String (标题)
   ├─ publication: String (会议/期刊)
   ├─ year: Number (发表年份)
   ├─ authors: Array (作者列表)
   │  ├─ id: Number (作者id)
   │  ├─ name: String (作者名字)
   │  └─ ins: String (作者所属机构)
   └─ keywords: Array (关键词列表): Array (关键词列表)

```

* 返回接口格式：

```
├─ content: Array 
│  ├─ category: Number 
│  ├─ affiliationName: String (机构名)
│  ├─ authorName: String (作者名)
│  ├─ id: Number (作者id)
│  ├─ activation: Number (作者的活跃度)
│  └─ db: String 
├─ success: Boolean 
└─ message: String 

```