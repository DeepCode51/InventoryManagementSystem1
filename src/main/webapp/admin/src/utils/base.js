const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmtdl73/",
            name: "ssmtdl73",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmtdl73/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "华亿库存管理系统"
        } 
    }
}
export default base
