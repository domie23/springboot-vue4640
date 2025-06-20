import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xueshengxuefen from '@/views/modules/xueshengxuefen/list'
    import suguan from '@/views/modules/suguan/list'
    import chuqinpaixingbang from '@/views/modules/chuqinpaixingbang/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import chuqinlvpingjia from '@/views/modules/chuqinlvpingjia/list'
    import jianxuefenchufa from '@/views/modules/jianxuefenchufa/list'
    import jinggaotixing from '@/views/modules/jinggaotixing/list'
    import tijiaobaogao from '@/views/modules/tijiaobaogao/list'
    import susheloudong from '@/views/modules/susheloudong/list'
    import xiaochuqueqinbaogao from '@/views/modules/xiaochuqueqinbaogao/list'
    import xueshengkaoqin from '@/views/modules/xueshengkaoqin/list'
    import banji from '@/views/modules/banji/list'
    import jiaxuefenjiangli from '@/views/modules/jiaxuefenjiangli/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xueshengxuefen',
        name: '学生学分',
        component: xueshengxuefen
      }
      ,{
	path: '/suguan',
        name: '宿管',
        component: suguan
      }
      ,{
	path: '/chuqinpaixingbang',
        name: '出勤排行榜',
        component: chuqinpaixingbang
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/chuqinlvpingjia',
        name: '出勤率评价',
        component: chuqinlvpingjia
      }
      ,{
	path: '/jianxuefenchufa',
        name: '减学分处罚',
        component: jianxuefenchufa
      }
      ,{
	path: '/jinggaotixing',
        name: '警告提醒',
        component: jinggaotixing
      }
      ,{
	path: '/tijiaobaogao',
        name: '提交报告',
        component: tijiaobaogao
      }
      ,{
	path: '/susheloudong',
        name: '宿舍楼栋',
        component: susheloudong
      }
      ,{
	path: '/xiaochuqueqinbaogao',
        name: '消除缺勤报告',
        component: xiaochuqueqinbaogao
      }
      ,{
	path: '/xueshengkaoqin',
        name: '学生考勤',
        component: xueshengkaoqin
      }
      ,{
	path: '/banji',
        name: '班级',
        component: banji
      }
      ,{
	path: '/jiaxuefenjiangli',
        name: '加学分奖励',
        component: jiaxuefenjiangli
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
