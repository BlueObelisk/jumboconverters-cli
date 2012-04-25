package org.xmlcml.cml.converters.cli;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.xmlcml.cml.converters.AbstractConverterModule;
import org.xmlcml.cml.converters.Converter;
import org.xmlcml.cml.converters.ConverterRegistry;

public class CliConverterRegistryTest {

	private final static int MODULE_LIST_SIZE = 21;
	private final static int CONVERTER_LIST_SIZE = 36;
	
	@Test
	@Ignore // TODO
	public void testModuleList() {
		ConverterRegistry registry = new ConverterRegistry(this.getClass());
		List<AbstractConverterModule> moduleList = registry.createModuleList();
		Assert.assertNotNull(moduleList);
		for (AbstractConverterModule module : moduleList) {
			System.out.println(module);
		}
		Assert.assertEquals("modules", MODULE_LIST_SIZE, moduleList.size());
	}
	
	@Test
	@Ignore // TODO
	public void testConverterList() {
		ConverterRegistry registry = new ConverterRegistry(this.getClass());
		List<Converter> converterList = registry.getConverterList();
		Assert.assertNotNull(converterList);
		for (Converter converter : converterList) {
			System.out.println(converter);
		}
		Assert.assertEquals("modules", CONVERTER_LIST_SIZE, converterList.size());
	}
}
