const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot120wq/",
            name: "springboot120wq",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "学生宿舍管理系统"
        } 
    }
}
export default base
