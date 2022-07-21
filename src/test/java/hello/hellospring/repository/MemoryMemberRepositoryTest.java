package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class MemoryMemberRepositoryTest {

        MemberRepository memberRepository = new MemoryMemberRepository();

        @Test
        public void save(){
            Member member = new Member();
            member.setName("Spring");

            memberRepository.save(member);

            Member result = memberRepository.findById(member.getId()).get();
            System.out.println("result = " + (result == member));
            Assertions.assertEquals(result, member); //junit에서 제공하는 기능 result와 member를 비교할 수 있음
        }

        @Test
        public void findByName(){
            Member member1 = new Member();
            member1.setName("spring1");
            memberRepository.save(member1);

            Member member2 = new Member();
            member2.setName("spring2");
            memberRepository.save(member2);

            Member result = memberRepository.findByName("spring1").get();

        }

    }
