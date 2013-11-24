package com.event.common.pdf;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.event.common.model.Fruit;

public class PdfView extends AbstractPdfView {

	public PdfView() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void buildPdfMetadata(Map<String, Object> model,
			Document document, HttpServletRequest request) {
		document.addCreationDate();
		document.addCreator("aa");
		super.buildPdfMetadata(model, document, request);
	}

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document,
			PdfWriter arg2, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Fruit fruit = (Fruit) model.get("model");
		
		Table table = new Table(2);
		table.addCell(fruit.getName());
		table.addCell(String.valueOf(fruit.getQuality()));
		document.add(table);
		
	}

	

}
