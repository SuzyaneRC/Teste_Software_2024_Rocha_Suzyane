import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.security.Provider;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;

public class Teste {

    @Mock
    private Provider.Service service;

    @Captor
    private ArgumentCaptor<ArrayList<SomeType>> captor;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldDoStuffWithListValues() {

        verify(service).doStuff(captor.capture());
    }
}
