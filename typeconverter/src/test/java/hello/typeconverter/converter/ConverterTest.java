package hello.typeconverter.converter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import hello.typeconverter.type.IpPort;

public class ConverterTest {
	
//	@Test
	void StringToInteger() {
		StringToIntegerConverter converter = new StringToIntegerConverter();
		Integer result = converter.convert("10");
		assertThat(result).isEqualTo(10);
	}
	
//	@Test
	void IntgerToString() {
		IntegerToStringConverter converter = new IntegerToStringConverter();
		String result = converter.convert(10);
		assertThat(result).isEqualTo("10");
	}
	
	@Test
	void StringToIpPoprt() {
		StringToIpPortConverter converter = new StringToIpPortConverter();
		String source = "127.0.0.1:8080";
		IpPort result = converter.convert(source);
		assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
	}
	
//	@Test
	void IpPortToString() {
		IpPortToStringConverter converter = new IpPortToStringConverter();
		IpPort source = new IpPort("127.0.0.1", 8080);
		String result = converter.convert(source);
		assertThat(result).isEqualTo("127.0.0.1:8080");
	}

}
