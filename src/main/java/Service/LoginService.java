package Service;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.example.Community.Repository.Member;
import com.example.Community.Repository.MemberRepository;


@Transactional
public class LoginService {
	
	Member member = new Member();	
	private MemberRepository memberRepository; 

	public LoginService(MemberRepository memberRepository) {
		
		this.memberRepository = memberRepository;
		
		
		
	}
	
	
	public long join(Member member) {
		
		
		validateDuplicateMember(member);

		memberRepository.saveMember(member);
		
		return member.getMemberid();
		}
		
		
	
	
	private void validateDuplicateMember(Member member){
		memberRepository.findbyuserid(member.getUserid())
						.ifPresent(m ->{
						throw new IllegalStateException("이미 존재하는 회원입니다");
						});

		
	}
	
	public Optional<Member> findByuserid(String userid){
		
	
		
		return memberRepository.findbyuserid(userid);
	}
			
			
			
			
			
	
	
	
	
	public Optional<Member> findById(Long id) {
		
		return memberRepository.findbyId(id);
		
	}
	
	public boolean Login(String userid, String pw) {
		
		
		if(memberRepository.findbyuserid(userid).isPresent()) {
		
		if(userid.equals(memberRepository.findbyuserid(userid).get().getUserid())&&
		   pw.equals(memberRepository.findbyuserid(userid).get().getPw())) {
			return true;
			
		}
		
		else {
			return false;
			}
		
		}
		
		return false;
	}
	
}
