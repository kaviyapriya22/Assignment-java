package com.abc.productapp.librarymanagementsystem;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class MemberServiceTest {

    @Mock
    private MemberRepo memberRepo;

    @Mock
    private MembershipCardRepo membershipCardRepo;

    @InjectMocks
    private MemberService memberService;

    @Test
    void registerMember_positiveCase() throws InvalidCardException {
        //card with expiry date in future
        MembershipCard card = new MembershipCard();
        card.setExpiryDate(LocalDate.now().plusDays(10));

        //assigning the card to this member
        Member member = new Member();
        member.setName("Alice");
        member.setMembershipCard(card);

        //mocking save
        when(memberRepo.save(member)).thenReturn(member);
        Member savedMember = memberService.registerMember(member);

        //verifying the saved member is not null
        assertNotNull(savedMember);
        // checking the name of the saved member
        assertEquals("Alice", savedMember.getName());
        //verifying the save is called
        verify(memberRepo).save(member);
    }

    @Test
    void registerMember_NoMembershipCard() {
        // only assigning member name without car , since cascadetype is all throws exception
        Member member = new Member();
        member.setName("Bob");
        assertThrows(InvalidCardException.class, () ->
                memberService.registerMember(member)
        );
    }

    @Test
    void registerMember_Negative_ExpiredCard() {
       //crating card with expired state in the past
        MembershipCard expiredCard = new MembershipCard();
        expiredCard.setExpiryDate(LocalDate.now().minusDays(1));

        Member member = new Member();
        member.setName("Charlie");
        member.setMembershipCard(expiredCard);

        assertThrows(InvalidCardException.class, () ->
                memberService.registerMember(member)
        );
    }

    @Test
    void findMemberAndMembershipCardById_Positive() throws MemberNotFoundException {

        MembershipCard card = new MembershipCard();
        Member member = new Member();
        member.setName("David");
        member.setMembershipCard(card);

        when(memberRepo.findById(1)).thenReturn(Optional.of(member));

        Member foundMember = memberService.findMemberAndMembershipCardById(1);
        //verifying that the member is not null
        assertNotNull(foundMember);
        // checking for equality
        assertEquals("David", foundMember.getName());

    }

    @Test
    void findMemberAndMembershipCardById_MemberNotFound() {
        //checking for memebrid without creating the member
        when(memberRepo.findById(1)).thenReturn(Optional.empty());
        assertThrows(MemberNotFoundException.class, () ->
                memberService.findMemberAndMembershipCardById(1)
        );
    }


}
