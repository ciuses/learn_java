package ru.ciuse.hw_4_orm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ciuse.hw_4_orm.entity.Auction;
import ru.ciuse.hw_4_orm.my_repo.AucRepoCustom;

import java.util.List;

@Repository
public class AucRepoImpl implements AucRepoCustom {

    private final EntityManager entityManager;

    @Autowired
    public AucRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    public List<Auction> findByCity(String city) {
        CriteriaBuilder myCritBild = entityManager.getCriteriaBuilder();
        CriteriaQuery<Auction> myCritQ = myCritBild.createQuery(Auction.class);

        Root<Auction> aucRoot = myCritQ.from(Auction.class);
        Predicate cityPredict = myCritBild.equal(aucRoot.get("city"), city);

        myCritQ.select(aucRoot).where(cityPredict);

        return entityManager.createQuery(myCritQ).getResultList();

    }

    @Override
    public List<Auction> findByName(String name) {
        CriteriaBuilder myCritBild = entityManager.getCriteriaBuilder();
        CriteriaQuery<Auction> myCritQ = myCritBild.createQuery(Auction.class);

        Root<Auction> aucRoot = myCritQ.from(Auction.class);
        Predicate cityPredict = myCritBild.equal(aucRoot.get("name"), name);

        myCritQ.select(aucRoot).where(cityPredict);

        return entityManager.createQuery(myCritQ).getResultList();

    }


}
