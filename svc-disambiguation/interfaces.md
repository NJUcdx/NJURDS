***本文档由 Rap2 (https://github.com/thx/rap2-delos) 生成***

***本项目仓库：[http://rap2.taobao.org/repository/editor?id=267630](http://rap2.taobao.org/repository/editor?id=267630) ***

***生成日期：2020-10-07 12:25:48***

# 仓库：高级软工实践-oasisplus
## 模块：search
### 接口：根据机构查询
* 地址：http://47.106.211.96:8883/search/institution
* 类型：GET
* 状态码：200
* 简介：根据作者查询
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415652&itf=1754019](http://rap2.taobao.org/repository/editor?id=267630&mod=415652&itf=1754019)
* 请求接口格式：

```

    ├─ institution: String  
	├─ page: Number
	├─ pageSize: Number   
	├─ sortBy: Number (0-按时间,1-按引用数) 
	├─ startTime: Number  
	└─ endTime: Number  
```

* 返回接口格式：

```

	├─ success: Boolean 
	├─ content: Object 
	│  ├─ documents: Array 
	│  │  ├─ publication: String 
	│  │  ├─ title: String 
	│  │  ├─ db: String (“ACM”“IEEE”)
	│  │  ├─ abstract: String 
	│  │  ├─ authors: Array 
	│  │  │  ├─ institution: String (用逗号隔开)
	│  │  │  ├─ id: Number 
	│  │  │  ├─ name: String 
	│  │  │  └─ db: String (“ACM”“IEEE”)
	│  │  ├─ citations: Number 
	│  │  ├─ year: Number 
	│  │  ├─ docId: Number 
	│  │  └─ keywords: String (用逗号隔开)
	│  └─ total: Number 
	└─ message: String 

```


### 接口：根据作者查询
* 地址：http://47.106.211.96:8883/search/author
* 类型：GET
* 状态码：200
* 简介：根据作者查询
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415652&itf=1755191](http://rap2.taobao.org/repository/editor?id=267630&mod=415652&itf=1755191)
* 请求接口格式：

```

	├─ author: String 
	├─ page: Number 
	├─ pageSize: Number 
	├─ sortBy: Number (0-按时间,1-按引用数)
	├─ startTime: Number 
	└─ endTime: Number 

```

* 返回接口格式：

```

	├─ success: Boolean 
	├─ content: Object 
	│  ├─ documents: Array 
	│  │  ├─ publication: String 
	│  │  ├─ title: String 
	│  │  ├─ db: String (“ACM”“IEEE”)
	│  │  ├─ abstract: String 
	│  │  ├─ authors: Array 
	│  │  │  ├─ institution: String (用逗号隔开)
	│  │  │  ├─ id: Number 
	│  │  │  ├─ name: String 
	│  │  │  └─ db: String (“ACM”“IEEE”)
	│  │  ├─ citations: Number 
	│  │  ├─ year: Number 
	│  │  ├─ docId: Number 
	│  │  └─ keywords: String (用逗号隔开)
	│  └─ total: Number 
	└─ message: String 

```


## 模块：author
### 接口：作者在不同会议发表文章的情况
* 地址：http://47.106.211.96:8883/author/publication/summary	
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1753719](http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1753719)
* 请求接口格式：

```

	├─ id: Number (作者id)
	└─ db: String (“ACM”“IEEE”)

```

* 返回接口格式：

```

	└─ data: Array 
	   ├─ publication: String (会议名称)
	   └─ docCount: Number (论文数量)

```


### 接口：作者在不同研究方向发表文章的统计
* 地址：http://47.106.211.96:8883/author/field/summary
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1753798](http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1753798)
* 请求接口格式：

```

	├─ id: Number (作者id)
	└─ db: String ("ACM" "IEEE")

```

* 返回接口格式：

```

	└─ data: Array 
	   ├─ fieldName: String (领域名称)
	   ├─ fieldId: Number (领域id)
	   ├─ count: Number (论文统计)
	   └─ db: String ("ACM" "IEEE")

```


### 接口：作者详情
* 地址：http://47.106.211.96:8883/author/detail
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1754016](http://rap2.taobao.org/repository/editor?id=267630&mod=415719&itf=1754016)
* 请求接口格式：

```
	
	├─ id: Number (作者id)
	└─ db: String (“ACM”“IEEE”)

```

* 返回接口格式：

```

	├─ content: Array 
	│  ├─ id: Number (作者id)
	│  ├─ name: String (作者名称)
	│  ├─ institution: Array (机构名称)
	│  │  ├─ id: Number 
	│  │  ├─ name: String 
	│  │  └─ db: String ("ACM" "IEEE")
	│  ├─ activation: Number (活跃度=sum{文章被引用数/(当前年份-发表年份+1)})
	│  ├─ docCount: Number (论文数)
	│  ├─ fieldList: Array (研究领域)
	│  │  ├─ docCount: Number (论文数)
	│  │  ├─ id: Number (领域id)
	│  │  ├─ name: String (领域名称)
	│  │  └─ activation: Number (活跃度=sum{文章被引用数/(当前年份-发表年份)}
	*按field统计)
	│  ├─ totalCitations: Number (被引用数)
	│  └─ sameAuthors: Array 
	│     └─ name: String 
	├─ message: String 
	└─ success: Boolean 

```


## 模块：institution
### 接口：机构的研究方向统计
* 地址：http://47.106.211.96:8883/institution/field/stat
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1753901](http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1753901)
* 请求接口格式：

```
	
	├─ id: Number (机构id)
	└─ db: String ("ACM" "IEEE")

```

* 返回接口格式：

```

	└─ data: Array 
	   ├─ id: Number (领域id)
	   ├─ name: String (领域名称)
	   ├─ paperCount: Number (文章数量)
	   └─ db: String ("ACM" "IEEE")

```


### 接口：机构详情，可能需要增加图片与说明副本
* 地址：http://47.106.211.96:8883/institution/info
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1754010](http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1754010)
* 请求接口格式：

```

	├─ id: Number (机构id)
	└─ db: String ("ACM" "IEEE")

```

* 返回接口格式：

```

	└─ data: Array 
	   ├─ paperCount: Number (文章数量)
	   ├─ authorCount: Number (作者数量)
	   ├─ citeCount: Number (被引数量)
	   ├─ id: Number (机构id)
	   ├─ name: String (机构名称)
	   ├─ db: String ("ACM" "IEEE")
	   └─ sameIns: Array 
	      └─ name: String 

```


### 接口：机构作者发表文章数统计
* 地址：http://47.106.211.96:8883/institution/author/stat
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1754011](http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1754011)
* 请求接口格式：

```

	├─ id: Number (机构id)
	└─ db: String ("ACM" "IEEE")

```

* 返回接口格式：

```

	└─ data: Array 
	   ├─ paperCount: Number (文章数量)
	   ├─ id: Number (作者id)
	   ├─ name: String (作者名称)
	   └─ db: String ("ACM" "IEEE")

```


### 接口：机构下作者活跃度统计
* 地址：http://47.106.211.96:8883/institution/author/activation
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1754013](http://rap2.taobao.org/repository/editor?id=267630&mod=415761&itf=1754013)
* 请求接口格式：

```

	├─ id: Number (机构id)
	└─ db: String ("ACM","IEEE")

```

* 返回接口格式：

```

	└─ data: Array 
	   ├─ activation: Number (活跃度=sum{文章被引用数/(当前年份-发表年份+1)})
	   ├─ id: Number (作者id)
	   ├─ name: String (作者名称)
	   └─ db: String ("ACM" "IEEE")

```