package hello.hellospring;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    /*
    * 회원 가입
    */
    public Long join(Member member){
        //같은 이름이 있는 중복 회원 X
        /*Optional<Member> result = memberRepository.findByName(member.getName()); // null일 경우 Optional로 감싸서 사용 가능
        //result.orElseGet();//값이 있으면 default값으로 꺼내
        result.ifPresent(m ->{ // ifPresent 만약 값이 존재할경우
            throw new IllegalStateException("이미 존재하는 회원입니다");
        });

        memberRepository.findByName(member.getName())
                        .ifPresent(m->{
                            throw new IllegalStateException("이미 존재하는 회원");
                        }); // 이미 Optional로 감쌋기때문에 이렇게 사용도 가능함
        */
        validateDuplicationMember(member);

        memberRepository.save(member);
        return member.getId();
    }
    private void validateDuplicationMember(Member member){
        memberRepository.findByName(member.getName())
                .ifPresent(m->{
                    throw new IllegalStateException("이미 존재하는 회원");
                }); // 이미 Optional로 감쌋기때문에 이렇게 사용도 가능함
    }
}
