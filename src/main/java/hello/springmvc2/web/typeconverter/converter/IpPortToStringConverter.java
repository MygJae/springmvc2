package hello.springmvc2.web.typeconverter.converter;

import hello.springmvc2.web.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {
    @Override
    public String convert(IpPort source) {
        log.info("convert source={}", source);
        //IpPort 객체 -> "127.0.0.1:8086"
        return source.getIp() + ":" + source.getPort();
    }


}
