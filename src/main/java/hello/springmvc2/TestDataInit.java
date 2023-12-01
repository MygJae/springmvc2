package hello.springmvc2;


import hello.springmvc2.domain.item.Item;
import hello.springmvc2.domain.item.ItemRepository;
import hello.springmvc2.domain.member.Member;
import hello.springmvc2.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));

        Member member = new Member();
        member.setName("테스트");
        member.setLoginId("test");
        member.setPassword("test!");
        
        memberRepository.save(member);
    }

}