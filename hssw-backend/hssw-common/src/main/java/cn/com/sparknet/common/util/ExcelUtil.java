package cn.com.sparknet.common.util;

import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Excel读写操作
 * @author chenxy
 * 
 */
public class ExcelUtil {
	
	/*****************************读取Excel文件********************************/
	
	/**
	 * 获取Excel工作簿
	 * @param is
	 * @return
	 * @throws Exception
	 */
	public Workbook getWorkbook(InputStream is) throws Exception {
		Workbook workbook=null;
		try{
			workbook=new XSSFWorkbook(is);
		}catch (Exception e) {
			throw new RuntimeException(e.getMessage(),e);
		}finally {
			if(null!=is){
				is.close();
				is=null;
			}
		}
		return workbook;
	}
	
	/**
	 * 根据索引获取工作表
	 * @param workBook
	 * @param sheetIndex
	 * @return
	 */
	public Sheet getSheetByIndex(Workbook workbook,int sheetIndex) {
		return workbook.getSheetAt(sheetIndex);
	}
	
	/**
	 * 根据名称获取工作表
	 * @param workBook
	 * @param sheetName
	 * @return
	 */
	public Sheet getSheetByName(Workbook workbook,String sheetName) {
		return workbook.getSheet(sheetName);
	}
	
	/**
	 * 获取工作表第一行索引
	 * @param sheet
	 * @return
	 */
	public int getFirstRowNum(Sheet sheet) {
		return sheet.getFirstRowNum();
	}
	
	/**
	 * 获取工作表最后一行索引
	 * @param sheet
	 * @return
	 */
	public int getLastRowNum(Sheet sheet) {
		return sheet.getLastRowNum();
	}
	
	/**
	 * 获取行
	 * @param sheet
	 * @param rownum
	 * @return
	 */
	public Row getRow(Sheet sheet,int rownum) {
		return sheet.getRow(rownum);
	}
	
	/**
	 * 获取行的第一列索引
	 * @param row
	 * @return
	 */
	public short getFirstCellNum(Row row) {
		return row.getFirstCellNum();
	}
	
	/**
	 * 获取行的最后一列索引
	 * @param row
	 * @return
	 */
	public short getLastCellNum(Row row) {
		return row.getLastCellNum();
	}
	
	/**
	 * 获取行的列
	 * @param row
	 * @param cellNum
	 * @return
	 */
	public Cell getCell(Row row,short cellNum) {
		return row.getCell(cellNum);
	}
	
	/*****************************创建Excel文件********************************/

}
