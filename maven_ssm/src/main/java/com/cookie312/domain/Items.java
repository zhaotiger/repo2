package com.cookie312.domain;

import java.util.Date;

/**
 *   `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` float(10,0) DEFAULT NULL,
  `pic` varchar(40) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `detail` varchar(200) DEFAULT NULL,
 * @author 123
 *
 */
public class Items {
	
	private Integer id;
	private String name;
	private Double price;
	private String pic;
	private Date createTime;
	private String detail;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", pic=" + pic + ", createTime=" + createTime
				+ ", detail=" + detail + "]";
	}
	
	
	
}
