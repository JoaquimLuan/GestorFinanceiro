package action

import java.util.List;
import org.hibernate.SessionFactory;

class ProducaoAgricolaDao {

    SessionFactory sessionFactory

    List<Object[]> retornaCustoSojaPorHectare() {
        String hql = """
                SELECT 
                    pa.cultura, 
                    pa.unidade, 
                    pa.custoPorHectare, 
                    pa.safraAno, 
                    pa.valorFaturado
                FROM ProducaoAgricola AS pa
                WHERE pa.cultura = 'Soja'
        """;

        List<Object[]> resultado = (List<Object[]>) session.createQuery(hql).getResultList();

        return resultado;
    }
}
