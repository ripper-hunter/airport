package com.w.Daonterface;


import java.util.List;



import com.w.data.Bumenn;
import com.w.data.Diyu;
import com.w.data.Tianbao;


public interface TableDaoInterface {

	public void save(Tianbao transientInstance) ;

	public void delete(Tianbao persistentInstance);

	public List findById(Object id);

	public List findByExample(Tianbao instance);

	public List findByProperty(String propertyName, Object value);
	public List findByQuancheng(Object quancheng) ;

	public List findByGuikou(Object guikou);
	public List findByTongxun(Object tongxun);

	public List findByDiyu(Object diyu);

	public List findByWangzhi(Object wangzhi);

	public List findByYouxiang(Object youxiang) ;

	public List findByDaibiao(Object daibiao) ;

	public List findByYoubian(Object youbian) ;

	public List findByLianxi(Object lianxi) ;

	public List findByPhone(Object phone) ;

	public List findByMphone(Object mphone) ;

	public List findByChuanzhen(Object chuanzhen);

	public List findByJigou(Object jigou) ;

	public List findByJianjie(Object jianjie) ;

	public List findByJname(Object jname) ;

	public List findByQishinian(Object qishinian) ;
	public List findByZhongzhinian(Object zhongzhinian) ;

	public List findByGaishu(Object gaishu);
	public List findByGjzi(Object gjzi) ;

	public List findByZijin(Object zijin) ;

	public List findByFangshi(Object fangshi);

	public List findByYixiandanwei(Object yixiandanwei) ;

	public List findByHdlx(Object hdlx) ;

	public List findByXueke(Object xueke) ;

	public List findByXuqiuliyu(Object xuqiuliyu);

	public List findByQita(Object qita) ;

	public List findByXiqiuyingyong(Object xiqiuyingyong) ;

	public List findByZhuangtai(Object zhuangtai) ;
	public List findByNjname(Object njname);
	public List findAll();

	public Tianbao merge(Tianbao detachedInstance) ;

	public void attachDirty(Tianbao instance) ;

	public void attachClean(Tianbao instance);
	
	public List<Bumenn> bumenns();
	public List<Diyu> diyus();
	public boolean inputcheck(Tianbao tianbao);
	public List xqgl(Tianbao tianbao);
	public void add(Tianbao tianbao);
	
}
