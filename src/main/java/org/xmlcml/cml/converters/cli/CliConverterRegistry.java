package org.xmlcml.cml.converters.cli;

import java.util.ArrayList;
import java.util.List;

import org.xmlcml.cml.converters.Converter;

public class CliConverterRegistry {
	private List<Converter> converterList;

	public CliConverterRegistry() {
		
	}
	
	public List<Converter> createConverterList() {
		if (converterList == null) {
			converterList = new ArrayList<Converter>();
		}
		return converterList;
	}
	
}
