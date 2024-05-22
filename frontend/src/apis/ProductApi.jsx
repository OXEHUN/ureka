import API from "./Api";

async function getProductCardListByCompany(token, id, success, fail) {
  try {
    const response = await API(token).get(`/card/prod/comp/list/${id}`);
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function getProductCardListByCategory(token, id, success, fail) {
  try {
    const response = await API(token).get(`/card/prod/category/list/${id}`);
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function getProductCardDetail(token, id, success, fail) {
  try {
    const response = await API(token).get(`/card/prod/detail/${id}`);
    success(response);
  } catch (error) {
    fail(error);
  }
}

// 등록된 결제카드 불러오기
async function getMyPaymentCards(token, yyyymm, success, fail) {
  try {
    const response = await API(token).get(`/ucard/list/pay?yyyymm=${yyyymm}`);
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function getMySingleCardBenefitList(
  token,
  yyyymm,
  userCardId,
  success,
  fail
) {
  try {
    const response = await API(token).get(
      `/static/${yyyymm}/discount/${userCardId}`
    );
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function get3RecommendCard(token, userCardId, success, fail) {
  try {
    const response = await API(token).get(
      `/ucard/prod/recommand/main?userCardId=${userCardId}`
    );
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function getCompareMycardAndRecommendCard(
  token,
  userCardId,
  success,
  fail
) {
  try {
    const response = await API(token).get(
      `/ucard/prod/compare?userCardId=${userCardId}`
    );
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function getConsumptionCompareTop3(token, userCardId, success, fail) {
  try {
    const response = await API(token).get(
      `/ucard/prod/recommend/top3?userCardId=${userCardId}`
    );
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function getUserTop10(token, success, fail) {
  try {
    const response = await API(token).get(`/static/most-owned/cards`);
    success(response);
  } catch (error) {
    fail(error);
  }
}

async function getDdoraeTop10(token, userCardId, success, fail) {
  try {
    const response = await API(token).get(
      `/static/most-owned/cards/ageGroup?userCardId=${userCardId}`
    );
    success(response);
  } catch (error) {
    fail(error);
  }
}

export {
  getProductCardListByCompany,
  getProductCardListByCategory,
  getProductCardDetail,
  getMyPaymentCards,
  getMySingleCardBenefitList,
  getCompareMycardAndRecommendCard,
  get3RecommendCard,
  getConsumptionCompareTop3,
  getUserTop10,
  getDdoraeTop10,
};
