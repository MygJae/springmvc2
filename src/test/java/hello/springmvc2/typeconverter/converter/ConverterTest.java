package hello.springmvc2.typeconverter.converter;

import hello.springmvc2.web.typeconverter.converter.IntegerToStringConverter;
import hello.springmvc2.web.typeconverter.converter.IpPortToStringConverter;
import hello.springmvc2.web.typeconverter.converter.StringToIntegerConverter;
import hello.springmvc2.web.typeconverter.converter.StringToIpPortConverter;
import hello.springmvc2.web.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        assertThat(result).isEqualTo(10);
    }

    @Test
    void IntegerToString() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);
        assertThat(result).isEqualTo("10");
    }

    @Test
    void stringToIpPort() {
        //강의에서 바꿔서 한듯
        StringToIpPortConverter converter = new StringToIpPortConverter();
        String source = "127.0.0.1:8086";
        IpPort result = converter.convert(source);
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8086));
    }

    @Test
    void ipPortToString() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8086);
        String result = converter.convert(source);
        assertThat(result).isEqualTo("127.0.0.1:8086");
    }


}
