
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
System.out.println(campaign.getName()+" kampanyas� ba�ar�yla eklenmi�tir.");		
	}

	@Override
	public void delete(Campaign campaign) {
System.out.println(campaign.getName()+ " kampanyas� ba�ar�yla silinmi�tir.");		
	}

	@Override
	public void update(Campaign campaign) {
System.out.println(campaign.getName()+" kampanyas� ba�ar�yla g�ncellenmi�tir.");		
	}

}