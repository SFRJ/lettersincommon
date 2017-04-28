import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonLettersTest {

    private String first;
    private String second;
    private CommonLetters commonLetters = new CommonLetters();

    @Test
    public void shouldHaveAInCommon() throws Exception {

        givenTwoWords("A","A");

        String inCommon = commonLetters.find(first, second);

        assertThat(inCommon).isEqualTo("A");
    }

    @Test
    public void shouldHaveBInCommon() throws Exception {
        givenTwoWords("B", "AB");

        String inCommon = commonLetters.find(first,second);

        assertThat(inCommon).isEqualTo("B");
    }

    @Test
    public void shouldHaveABInCommon() throws Exception {
        givenTwoWords("AB", "AB");

        String inCommon = commonLetters.find(first,second);

        assertThat(inCommon).isEqualTo("AB");
    }

    @Test
    public void shouldHaveCDInCommon() throws Exception {
        givenTwoWords("CD", "CDD");

        String inCommon = commonLetters.find(first,second);

        assertThat(inCommon).isEqualTo("CD");
    }

    @Test
    public void shouldHaveXYInCommon() throws Exception {
        givenTwoWords("XXXXX", "YYYYYX");

        String inCommon = commonLetters.find(first,second);

        assertThat(inCommon).isEqualTo("X");
    }

    @Test
    public void shouldHaveOnlyBInCommon() throws Exception {
        givenTwoWords("ABC", "BD");

        String inCommon = commonLetters.find(first,second);

        assertThat(inCommon).isEqualTo("B");
    }

    private void givenTwoWords(String first, String second) {
        this.first = first;
        this.second = second;
    }

}
