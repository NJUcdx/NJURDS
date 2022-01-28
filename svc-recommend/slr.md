## 模块：slr
### 接口：系统化文献评价
* 地址：http://47.106.211.96:8885/slr/recommend
* 类型：GET
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=425466&itf=1803041](http://rap2.taobao.org/repository/editor?id=267630&mod=425466&itf=1803041)
* 请求接口格式：

```
├─ keyword: String 
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
│  │  ├─ abs: String 
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