package action

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import action.model.ProducaoAgricola

@Repository
@Component
class ProducaoAgricolaDao {

    @Autowired
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

        List<Object[]> resultado = (List<Object[]>) sessionFactory.getCurrentSession().createQuery(hql).getResultList();

        return resultado;
    }

}
