package sku.fsuper.zzti.com.sku;
/**
 * 颜色、尺码属性
 */
public class SkuItme {
	private String id;//id
	private String skuSize;//尺码
	private String skuColor;//颜色
	private int skuStock;//库存
	private String skuIamgeUrl;//图片路径
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSkuSize() {
		return skuSize;
	}
	public void setSkuSize(String skuSize) {
		this.skuSize = skuSize;
	}
	public String getSkuColor() {
		return skuColor;
	}
	public void setSkuColor(String skuColor) {
		this.skuColor = skuColor;
	}
	public int getSkuStock() {
		return skuStock;
	}
	public void setSkuStock(int skuStock) {
		this.skuStock = skuStock;
	}
	public String getSkuIamgeUrl() {
		return skuIamgeUrl;
	}
	public void setSkuIamgeUrl(String skuIamgeUrl) {
		this.skuIamgeUrl = skuIamgeUrl;
	}


}
